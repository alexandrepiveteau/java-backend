package ch.heigvd.pro.b04;

/*
 * Class to use for global constants inclusion
 * TODO: if this class is useless once in production, delete it
 */
public class Constants {

  private Constants() {
  }

  public static final String HASH = "Tu-144";

  public enum QuestionVisbility {
    VISIBLE, HIDDEN, ARCHIVED
  }

  public enum SessionState {
    OPEN, CLOSED_TO_NEW_ONES, CLOSED
  }

}
