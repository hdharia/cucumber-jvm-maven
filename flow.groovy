stage 'Build & Test'
node 
{
    git 'https://github.com/hdharia/cucumber-jvm-maven.git'
    
    env.PATH = "${tool 'mvn-3.3.3-x'}/bin:${env.PATH}"
    
    sh 'mvn -e clean install'
    
    publishHTML(target: [allowMissing: false, alwaysLinkToLastBuild: true, keepAll: false, reportDir: 'target/site/cucumber-reports', reportFiles: 'feature-overview.html', reportName: 'HTML Report'])

}
