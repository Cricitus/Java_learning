package com.werner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;

    //开机页面
    public void start(){
        while(true){
            System.out.println("欢迎您");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("没有这个操作");
            }
        }
    }

    private void login(){
        System.out.println("开始登录");

        if (accounts.size() == 0){
            System.out.println("没有账户信息，请开户再测试");
            return;
        }

        while(true){
            System.out.println("请输入您的卡号 ");
            String cardId = sc.next();
            Account account = getAccountByCardId(cardId);
            if(account == null){
                System.out.println("卡号不存在");
            }else{
                while(true){
                    System.out.println("请输入密码 ");
                    String password = sc.next();
                    if(account.getPassWord().equals(password)){
                        loginAcc = account;
                        System.out.println("密码正确");
                        showUserCommand();
                        return;
                    }else{
                        System.out.println("密码不正确，请重新输入");
                    }
                }
            }
        }
    }

    private void showloginAccount(){
        System.out.println("===========");
        System.out.println("卡号" + loginAcc.getCardId());
        System.out.println("名字" + loginAcc.getUserName());
        System.out.println("性别" + loginAcc.getSex());
        System.out.println("余额" + loginAcc.getMoney());
        System.out.println("每次取限额度" + loginAcc.getCardId());


    }

    private void showUserCommand(){
        while(true){
            System.out.println("你可以选择以下功能： ");
            System.out.println("1，查询账户");
            System.out.println("2，存款");
            System.out.println("3，取款");
            System.out.println("4，转账");
            System.out.println("5.密码修改");
            System.out.println("6，推出");
            System.out.println("7.注销");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    showloginAccount();
                    break;
                case 2:
                    depositeMoney();
                    break;
                case 3:
                    drawmoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    changePassWord();
                    return;
                case 6:
                    System.out.println(loginAcc.getCardId() + "退出系统");
                    return ;
                case 7:
                    if(deleteAccount()){
                        return;
                    };
                    break;
                default:
                    System.out.println("操作错误");
            }
        }
    }

    private void changePassWord(){
        System.out.println("进行账户密码更改 ");
        while(true){
            System.out.println("请输入原密码");
            String password = sc.next();
            if(password.equals(loginAcc.getPassWord())){
                while(true){
                    System.out.println("请输入新密码 ");
                    String password1 = sc.next();

                    System.out.println("请输入确认密码 ");
                    String password2 = sc.next();

                    if(password1.equals(password2)){
                        loginAcc.setPassWord(password1);
                        System.out.println("密码修改成功");
                        return;
                    }
                    else{
                        System.out.println("两次密码不一样，请重新输入");
                    }
                }
            }
            else{
                System.out.println("密码有错误，重新输入");
            }
        }
    }

    private boolean deleteAccount(){
        System.out.println("销户当中，请谨慎操作");
        System.out.println("你确定注销账户吗？ y/n");
        String command = sc.next();
        switch (command){
            case "y":
                if(loginAcc.getMoney() == 0){
                    accounts.remove(loginAcc);
                    System.out.println("销户成功");
                    return true;
                }else{
                    System.out.println("账户有余额，不允许销户 ");
                    return false;
                }
            default:
                System.out.println("保留账户");
                return false;
        }
    }

    private void depositeMoney(){
        System.out.println("请你输入存款金额： ");
        double depositeMoney = sc.nextDouble();

        loginAcc.setMoney(loginAcc.getMoney() + depositeMoney);
        System.out.println("你成功存钱 " + depositeMoney + "余额为 " +  loginAcc.getMoney());
    }

    private void drawmoney(){
        if(loginAcc.getMoney() < 100) {
            System.out.println("账户余额不够");
            return;
        }
        while(true){
            System.out.println("请你输入取款金额 ");
            double money = sc.nextDouble();

            if(money <= loginAcc.getMoney()) {
                if(money > loginAcc.getLimit()) {
                    System.out.println("你取款的金额超出单次限额 ");
                }
                else{
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("取款成功，你的余额为 " +  loginAcc.getMoney());
                    break;
                }
            }
            else{
                System.out.println("余额不足 ");
            }
        }
    }


    private void transferMoney(){
        System.out.println("转账");
        if(accounts.size() <= 1){
            System.out.println("账户数不足，无法转账");
        }

        if(loginAcc.getMoney() == 0 ){
            System.out.println("你个穷逼还想转钱？？？");
            return;

        }

        while(true){
            System.out.println("请输入对方的卡号 ");
            String cardId = sc.next();

            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                System.out.println("卡号不存在");
            }
            while(true){
                if(acc != null) {
                    System.out.println("请输入您的转账金额 ");
                    double moneya = sc.nextDouble();
                    if (moneya < loginAcc.getMoney()) {
                        System.out.println("没钱就别转账了");
                    } else {
                        loginAcc.setMoney(loginAcc.getMoney() - moneya);
                        acc.setMoney(acc.getMoney() + moneya);
                        return;
                    }
                }
            }
        }
    }

    //开户操作
    private void createAccount(){
        Account account = new Account();

        System.out.println("请输入你的账户名称： ");
        String name = sc.next();
        account.setUserName(name);

        while(true){
            System.out.println("请输入你的性别： ");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                account.setSex(sex);
                break;
            }else {
                System.out.println("请输入正确的性别");
            }
        }

        while(true){
            System.out.println("请输入你的密码： ");
            String passWord = sc.next();
            System.out.println("请您输入你的确认密码： ");
            String passWord2 = sc.next();
            if(passWord.equals(passWord2)){
                account.setPassWord(passWord);
                break;
            }else{
                System.out.println("密码错误，请重新输入");
            }
        }

        System.out.println("请输入您的取钱额度： ");
        double limit = sc.nextDouble();
        account.setLimit(limit);

        String newCardId = createCardId();
        account.setCardId(newCardId);

        accounts.add(account);
        System.out.println("恭喜你" + account.getUserName() + " " + account.getCardId());


    }

    private String createCardId(){
        String cardId = " ";
        Random random = new Random();
        while(true){
            for(int i = 0; i < 8; i++){
                int data = random.nextInt(10);
                cardId += data;
            }

            Account account = getAccountByCardId(cardId);
            if(account == null){
                return cardId;
            }
        }

    }

    private Account getAccountByCardId(String cardId){
        for(int i = 0; i < accounts.size(); i++){
            Account account = accounts.get(i);
            if(accounts.get(i).getCardId().equals(cardId)){
                return account;
            }
        }
        return null;
    }

}
