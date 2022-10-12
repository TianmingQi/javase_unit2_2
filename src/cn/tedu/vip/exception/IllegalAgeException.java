package cn.tedu.vip.exception;

/**
 * �Զ����쳣��
 */
public class IllegalAgeException extends Exception{
    private static final long serialVersionUID = 1L;

    public IllegalAgeException(){
        super();
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }
}
