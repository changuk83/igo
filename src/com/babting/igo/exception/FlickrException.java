package com.babting.igo.exception;

public class FlickrException extends Exception {
	private static final long serialVersionUID = -5417152405333977272L;
	private String errorCode;
    private String errorMessage;

    public FlickrException(String errorCode, String errorMessage) {
        super(errorCode + ": " + errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * @param arg0
     * @param arg1
     */
    public FlickrException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    /**
     * @param arg0
     */
    public FlickrException(String arg0) {
        super(arg0);
    }

    /**
     * @param arg0
     */
    public FlickrException(Throwable arg0) {
        super(arg0);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
