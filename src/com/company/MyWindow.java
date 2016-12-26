package com.company;

/**
 * Created by garkaviy on 13.12.2016.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;


    // пустой конструктор
    public MyWindow() {
    }

    //конструктор с одной параметрами
    public MyWindow(double width) {
        this.width = width;

    }

    //конструктор с двумя параметрами
    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }


    //конструктор с тремя параметрами, изменим под задачу 2.3.4
    public MyWindow(double width, double height, int numberOfGlass) {
/*        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;*/
        this( width,  height,  numberOfGlass, null);
    }


    //конструктор с четыремя параметрами, изменим под задачу 2.3.4
    public MyWindow(double width, double height, int numberOfGlass, String color) {
/*        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;*/
        this( width,  height,  numberOfGlass, color,false);
    }


    //Изначальный конструктор с пятью параметрами
    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

//
//    public MyWindow(double width){
//        MyWindow(double)
//
//    }
//

    // 243

    public void printFields() {
        System.out.println("Поля класса - " + "длина " + width + " ширина " + height + " кол-во стекол " + numberOfGlass + " цвет " + color + " открыто " + isOpen);

    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }


}
