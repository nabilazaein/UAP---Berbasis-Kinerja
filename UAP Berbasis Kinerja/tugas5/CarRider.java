/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5prak;

/**
 *
 * @author hp
 */
class CarRider {
    public String name;
    public int age;
    public String phone;

    public CarRider(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }
     public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
