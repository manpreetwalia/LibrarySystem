package library.interfaces.daos;

import library.interfaces.entities.IMember; // interface

public interface IMemberHelper {

	public IMember makeMember(String firstName, String lastName, String contactPhone, String emailAddress, int id);

}
