def downloadgit()
{
   git 'https://github.com/DhirajGitHub0910/maven.git'  
}
def building()
{
   sh 'mvn package'
}
def deployment(path)
{
   deploy adapters: [tomcat9(credentialsId: 'baefdbc7-9a7a-450b-b42b-d9af879cb8ea', path: '', url: 'http://172.31.93.121:8080')], contextPath: "${path}", war: '**/*.war'
}
def testing()
{
   git 'https://github.com/DhirajGitHub0910/testing.git'
   sh 'java -jar /var/lib/jenkins/workspace/cicd_git/testing.jar'
}
def delivery(path1)
{
   deploy adapters: [tomcat9(credentialsId: 'baefdbc7-9a7a-450b-b42b-d9af879cb8ea', path: '', url: 'http://172.31.85.137:8080')], contextPath: "${path1}", war: '**/*.war'
}
hello my name is dhiraj