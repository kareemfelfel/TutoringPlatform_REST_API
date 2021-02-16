package com.clariontutors.users;

import org.springframework.data.repository.CrudRepository;

//Crud is generic type so it can return whatever datatype I send to it
//first parameter is the entity class. In this case, it is user
//Second parameter is the datatype of the Id or the key
public interface userRepository extends CrudRepository<user, String>{

}
