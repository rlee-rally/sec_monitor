package com.secmonitor.domain;

public class ImgEvent extends Event {
    public static final String EVENT_TYPE = "img";
    private String bytes;
    private long size;

    public ImgEvent() {
        super();
    }

    public ImgEvent(String date, String bytes, long size) {
        super(date);
        this.bytes = bytes;
        this.size = size;
    }

    public String getBytes() {
        return bytes;
    }

    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    public long getSize() {
        return size;
    }

    @Override
    public String getType() {
        return EVENT_TYPE;
    }
}
