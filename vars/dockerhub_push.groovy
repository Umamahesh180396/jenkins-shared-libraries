def call(String imageTag, String username){
  echo "Pushing docker image to docker hub"
                withCredentials([usernamePassword(credentialsId: 'jenkins-docker',
                passwordVariable: 'password',
                usernameVariable: 'username')]) {
                sh "docker login -u ${env.username} -p ${env.password}"
                sh 'docker push ${username}/notes-app:${imageTag}'
                }
  echo "Image pushed"
}
