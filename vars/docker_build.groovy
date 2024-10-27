def call(String imageTag, String username){
  echo "Building code"
  sh "docker build -t ${username}/notes-app:${imageTag} ."
}
