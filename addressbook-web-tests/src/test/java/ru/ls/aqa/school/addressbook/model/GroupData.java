package ru.ls.aqa.school.addressbook.model;

public class GroupData {
    private static String name;
    private static String header;
    private static String footer;

    public GroupData(String name, String footer, String header) {
    }

    public void groupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public static String getName() {
        return name;
    }

    public static String getHeader() {
        return header;
    }

    public static String getFooter() {

        return footer;
    }
}