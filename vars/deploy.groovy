def call(){
  echo "Deploying code"
  echo "Stopping and deleting existing container"
  sh 'docker compose down'
  sh 'docker compose up -d'
  echo "Code is deployed"
}
