def gitDownload(repo)

{

  git "https://github.com/IntelliqDevops/${repo}.git"

}

def BuildArtifact()

{
  sh 'mvn package'

}

def Depoyment(jobname,ip,context)

{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"

}

def Testing(jobname)

{
  sh "java -jar/var/lib/jenkins/workspace/${jobname}/testing.jar"

}
