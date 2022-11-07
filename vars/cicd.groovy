def downloadgit()
{
   git 'https://github.com/DhirajGitHub0910/maven.git'  
}
def building()
{
   sh 'mvn package'
}
def deployment(a)
{
   deploy adapters: [tomcat9(credentialsId: 'baefdbc7-9a7a-450b-b42b-d9af879cb8ea', path: '', url: 'http://172.31.93.121:8080')], contextPath: ${a}, war: '**/*.war'
}
