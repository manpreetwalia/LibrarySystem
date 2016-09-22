package library.daos;

import library.entities.Member; // library entities
import library.interfaces.daos.IMemberHelper; // import library interfaces of DAO for IMemberHelper
import library.interfaces.entities.IMember;  // import library interfaces of entities for IMember

public class MemberHelper implements IMemberHelper 

{

	@Override
	public IMember makeMember(String firstName, String lastName,
			String contactPhone, String emailAddress, int id)
	{
		
		return new Member(firstName, lastName, contactPhone, emailAddress, id); // returns new detail of memeber
	}

}
