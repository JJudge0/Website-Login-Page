package net.codejava;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE) // SHOULD BE SET TO NONE (NOTE IMPORTANT)
//@Rollback(false)
//public class UserRepositoryTests {
//    @Autowired
//    private static UserRepository repo;
//
//    @Autowired
//    private static TestEntityManager entityManager;
//
//   @Test
//    public static void testCreateUser()
//    {
//        User details = new User();
//      //  user.setId(1);// ID
//        details.setEmail("EmailTest@gmail.com"); // Email  Set email 
//        details.setPassword("password");  // User sets password
//        details.setFirstname("JJ"); // Users first name
//        details.setLastname("Hames"); // Users Last name
//        
//        User savedUser = repo.save(details);
//        // User data is saved and a new table is created with the SQL table
//
//        User existUser = entityManager.find(User.class, savedUser.getId());
//
//        assertThat(existUser.getEmail()).isEqualTo(details.getEmail());
//    }
//    
//}



@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;
    
    @Test
    public void testCreateAccount(){
        User user = new User();
       // details.setId(1); //Assigns ID automatically
        user.setEmail("Ben1@gmail.com");
        user.setPassword("Ben2");
        user.setFirstname("Ben");
        user.setLastname("Spiderman");

        User savedAccount = repo.save(user);

        User existAccount = entityManager.find(User.class, savedAccount.getId());

        assertThat(existAccount.getEmail()).isEqualTo(user.getEmail());
    }
    
    
//    @Test
//    public void testCreateAccount2(){
//        User details = new User();
//      //  details.setId(2); //Assigns ID automatically
//        details.setEmail("TestUser2@gmail.com");
//        details.setPassword("Alex2");
//        details.setFirstname("Martin");
//        details.setLastname("Homes");
//
//        User savedAccount = repo.save(details);
//
//        User existAccount = entityManager.find(User.class, savedAccount.getId());
//
//        assertThat(existAccount.getEmail()).isEqualTo(details.getEmail());
//    }
    
     @Test
     // Finds email within database test passed because it's in the database
      public void testFindUserByEmail()
     {
    	 String email="xoxiwed448@huekieu.com";
    	 
    	 User user = repo.findByEmail(email);
    	 
    	 assertThat(user).isNotNull();
    	 
     }
     
     
   }

