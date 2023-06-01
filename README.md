# Матеј Тодоровски 213118

## 2. Control Flow Graph
![SILab2Diagram](https://github.com/Matejtod23/SI_2023_lab2_213118/assets/108230956/010f6446-3fb6-49b8-b847-0cad7f6d93df)


## 3. Цикломатска комплексност  
цикломатската комплексност на овој код е 11, која се добива со бројот на предикатни јазли во кодот односно if услови.

## 4. Тест случаи според критериумот Every Branch
     Test Case 1: Mandatory Information Missing
        - Input: user = null
          Резултат: RuntimeException со пораката "Mandatory information missing!"
     Test Case 2: Email is invalid
        - Input: user = new User("username", "password", "invalidemail")
          Резултат: same = 1 (невалиден емаил)
     Test Case 3: Email е веќе искоритен или username е веќе искористен
        - Input: user = new User("existing", "password", "existingemail@example.com"), allUsers содржи User објекти со email "existingemail@example.com"
        - Резултат: same = 2 (email или username е веќе искористен)
     Test Case 4: Password contains username and length is less than 8
        - Input: user = new User("username", "password", "email@example.com")
          Резултат: false
     Test Case 5: Password contains special characters and email/username are unique
        - Input: user = new User("username", "password!", "email@example.com"), Каде password содржи специјален карактер
          Резултат: true
  
## 5. Тест случаи според критериумот Multiple Condition според if (user==null || user.getPassword()==null || user.getEmail()==null)
   ### Test case: user == null, сите други се занемруваат бидејќи првиот услов е точен
      user = null, user.getPassword()==null, user.getEmail()==null
   ### Test case: user.getPassword() == null, user != null
      user != null ,user = validUser (каде user.getPassword() е null)
   ### Test case: user.getEmail() == null, додека другите не се null
      user != null, user.getPassword() != null, user = validUser (каде user.getEmail() е null)
   ### Test case: Сите услови се неточни
      user = validUser (каде user, user.getPassword(), и user.getEmail() не се null)

