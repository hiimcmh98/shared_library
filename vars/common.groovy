boolean stringCredentialsExist(String id) {
  try {
    withCredentials([string(credentialsId: id, variable: 'irrelevant')]) {
      true
    }
  } catch (_) {
    false
  }
}
