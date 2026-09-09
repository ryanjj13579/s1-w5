public class WordGuessing {
  private String wordToBeGuessed;
  private String userString = "_____";// 5 underscores

  // we will say that secret must be five characters
  public WordGuessing(String secret) {
    wordToBeGuessed = secret;
  }

  // pre-condition:
  // - letter is in word
  // - word is 5 characters
  // substring(1param); substring (2-param)
  // indexOf, length
  public void update(String letter) {
    int letPosition = wordToBeGuessed.indexOf(letter);
    userString = userString.substring(0, letPosition) + letter + userString.substring(letPosition+1);
  }

  public String getUserString() {
    return userString;
  }
}
