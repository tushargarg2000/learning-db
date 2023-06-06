package com.example.databaseLearning;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user){

        userRepository.save(user);
        return "User saved successfully";
    }

    public User getUserById(Integer userId){


        try{
            User user = userRepository.findById(userId).get();
            return user;
        }catch (Exception e){
            System.out.println("We are in the exception and message is "+e.getMessage());
            return null;
        }
    }




}
