def call(){
  echo "Deploying code"
  echo "Stopping and deleting existing container"
  sh 'docker compsoe down'
  sh 'docker compose up -d'
  echo "Code is deployed"
}
