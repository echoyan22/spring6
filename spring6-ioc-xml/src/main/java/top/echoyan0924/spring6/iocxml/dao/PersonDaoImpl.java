package top.echoyan0924.spring6.iocxml.dao;

public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("person run....");
    }
}
