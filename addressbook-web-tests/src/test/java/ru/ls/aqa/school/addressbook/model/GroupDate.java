package ru.ls.aqa.school.addressbook.model;

    public class GroupData {
    private String name;
    private String header;
    private String footer;

    public groupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
