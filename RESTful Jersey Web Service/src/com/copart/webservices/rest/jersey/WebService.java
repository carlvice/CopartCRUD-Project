package com.copart.webservices.rest.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/DB")
public class WebService {

	@GET
	@Path("/sports")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSports() {
		Sport chess = new Sport();
		Sport relay = new Sport();
		Sport footBall = new Sport();
		Sport volleyBall = new Sport();
		Sport tennis = new Sport();
		chess.setId(1);
		chess.setName("Chess");
		chess.setType("I");
		chess.setMin(2);
		chess.setMax(30);
		chess.setTeamSize(0);
		relay.setId(2);
		relay.setName("Relay");
		relay.setType("T");
		relay.setMin(5);
		relay.setMax(50);
		relay.setTeamSize(5);
		footBall.setId(3);
		footBall.setName("FootBall");
		footBall.setType("T");
		footBall.setMin(4);
		footBall.setMax(50);
		footBall.setTeamSize(10);
		volleyBall.setId(4);
		volleyBall.setName("VolleyBall");
		volleyBall.setType("T");
		volleyBall.setMin(4);
		volleyBall.setMax(40);
		volleyBall.setTeamSize(10);
		tennis.setId(5);
		tennis.setName("Tennis");
		tennis.setType("T");
		tennis.setMin(4);
		tennis.setMax(40);
		tennis.setTeamSize(4);

		return chess.toString();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)

	public String registerForEvents(Registeration reg) {
		return "";

		/**
		 * if(There is still space in sport && User is not registered for 3 sports yet)
		 * Insert the value in db and return sucess message else return failure message
		 * with reason
		 */

		/**
		 * If it is a team event add user ids for team members based on the team size
		 * for the sport
		 */
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)

	public Registeration deRegister(Registeration reg) {
		return reg;
		/** De-register user from thew sport and restore capacity */
	}

}