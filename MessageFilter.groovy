class MessageFilter {
  def word

  MessageFilter(word) {
    this.word = word
  }

  def isDetect(text) {
    text.contains(word)
  }
}

