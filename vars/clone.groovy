def call(String url, String branch){
  echo "Git checkout"
  git branch: "${branch}", url: "${url}"
  echo "Code cloning is successfull"
}
