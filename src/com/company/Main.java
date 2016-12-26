package com.company;


public class Main {

    public static void main(String[] args) {


        MyWindow win1 = new MyWindow();
        win1.setWidth(1.1);
        win1.setHeight(1.2);
        win1.setNumberOfGlass(1);
        win1.setColor("blu");
        win1.setOpen(true);

        MyWindow win2 = new MyWindow();
        win2.setWidth(2.1);
        win2.setHeight(2.2);
        win2.setNumberOfGlass(2);
        win2.setColor("green");
        win2.setOpen(true);

        MyWindow win3 = new MyWindow();
        win3.setWidth(3.1);
        win3.setHeight(3.2);
        win3.setNumberOfGlass(3);
        win3.setColor("red");
        win3.setOpen(false);

        MyWindow win4 = new MyWindow();
        win4.setWidth(4.1);
        win4.setHeight(4.2);
        win4.setNumberOfGlass(4);
        win4.setColor("elloy");
        win4.setOpen(true);

        MyWindow win5 = new MyWindow();
        win5.setWidth(5.1);
        win5.setHeight(5.2);
        win5.setNumberOfGlass(5);
        win5.setColor("grey");
        win5.setOpen(false);



        //создаем экземпляр класса с помощью конструктора без параметров
        MyWindow win6 = new MyWindow();

        //создаем экземпляр класса с помощью конструктора с полями
        MyWindow win7 = new MyWindow(7.1, 7.2, 7, "СЫНИЙ", true ){
        };

        MyWindow win8 = new MyWindow(8.1, 8.2, 8, "СЫНИЙ" ){
        };

        MyWindow win9 = new MyWindow(9.1, 9.2, 9 ){
        };
        MyWindow win10 = new MyWindow(10.1, 10.2 ){
        };


        MyWindow[] windows = new MyWindow[10];
        windows[0] = win1;
        windows[1] = win2;
        windows[2] = win3;
        windows[3] = win4;
        windows[4] = win5;
        windows[5] = win6;
        windows[6] = win7;
        windows[7] = win8;
        windows[8] = win9;
        windows[9] = win10;

        //   243  ?????


        for (int i = 0; i < windows.length; i++) {
            windows[i].printFields();

        }
    }
}

