package gwendolen.privacy.health_app;

import java.util.HashSet;
import java.util.Set;

import ail.syntax.Message;
import ail.syntax.Predicate;
import gwendolen.mas.VerificationofAutonomousSystemsEnvironment;

public class HealthAppVerificationEnv extends VerificationofAutonomousSystemsEnvironment {
	// belief(workout_plan(present))
	// belief(diet_recommendations(present))
	// belief(daily_physical_activities(monitored))
	boolean workout_plan_present_sent = true;
	boolean diet_recommendations_present_sent = true;
	boolean daily_physical_activities_monitored_sent = true;

	//data(full_name)
	//data(dob) *
	//data(gender)
	//data(bmi) *
	//data(contact)
	//data(home_address)
	//data(marital_status) *
	//data(occupation) *
	//data(education) *
	//data(gps) *
	//data(social_media)
	boolean full_name_sent = true;
	boolean dob_sent = false;
	boolean gender_sent = true;
	boolean bmi_sent = true;
	boolean contact_sent = false;
	boolean home_address_sent = true;
	boolean marital_status_sent = true;
	boolean occupation_sent = true;
	boolean education_sent = true;
	boolean gps_sent = true;
	boolean social_media_sent = true;


	@Override
	public Set<Predicate> generate_percepts() {
		// TODO Auto-generated method stub
		return new HashSet<Predicate>();
	}

	@Override
	public Set<Message> generate_messages() {
		// TODO Auto-generated method stub
		Set<Message> messages = new HashSet<Message>();

		if (!workout_plan_present_sent) {
			boolean workout_plan_present = random_bool_generator.nextBoolean();
			if (workout_plan_present) {
				Predicate workout_plan = new Predicate("workout_plan");
				workout_plan.addTerm(new Predicate("present"));
				messages.add(new Message(1, "user", "agent", workout_plan));
				workout_plan_present_sent = true;
			}
		}

		if (!diet_recommendations_present_sent) {
			boolean diet_recommendations_present = random_bool_generator.nextBoolean();
			if (diet_recommendations_present) {
				Predicate diet_recommendations = new Predicate("diet_recommendations");
				diet_recommendations.addTerm(new Predicate("present"));
				messages.add(new Message(1, "user", "agent", diet_recommendations));
				diet_recommendations_present_sent = true;
			}

		}


		if (!daily_physical_activities_monitored_sent) {
			boolean daily_physical_activities_monitored = random_bool_generator.nextBoolean();
			if (daily_physical_activities_monitored) {
				Predicate daily_physical_activities = new Predicate("daily_physical_activities");
				daily_physical_activities.addTerm(new Predicate("monitored"));
				messages.add(new Message(1, "user", "agent", daily_physical_activities));
				daily_physical_activities_monitored_sent = true;
			}
		}


		if (!full_name_sent) {
			boolean full_name_requested = random_bool_generator.nextBoolean();
			if (full_name_requested) {
				Predicate full_name = new Predicate("request");
				full_name.addTerm(new Predicate("full_name"));
				full_name.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", full_name));
				full_name_sent = true;
			}
		}

		if (!dob_sent) {
			boolean dob_requested = random_bool_generator.nextBoolean();
			if (dob_requested) {
				Predicate dob = new Predicate("request");
				dob.addTerm(new Predicate("dob"));
				dob.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", dob));
				dob_sent = true;
			}
		}

		if (!gender_sent) {
			boolean gender_requested = random_bool_generator.nextBoolean();
			if (gender_requested) {
				Predicate gender = new Predicate("request");
				gender.addTerm(new Predicate("gender"));
				gender.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", gender));
				gender_sent = true;
			}
		}

		if (!bmi_sent) {
			boolean bmi_requested = random_bool_generator.nextBoolean();
			if (bmi_requested) {
				Predicate bmi = new Predicate("request");
				bmi.addTerm(new Predicate("bmi"));
				bmi.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", bmi));
				bmi_sent = true;
			}
		}

		if (!contact_sent) {
			boolean contact_requested = random_bool_generator.nextBoolean();
			if (contact_requested) {
				Predicate contact = new Predicate("request");
				contact.addTerm(new Predicate("contact"));
				contact.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", contact));
				contact_sent = true;
			}
		}

		if (!home_address_sent) {
			boolean home_address_requested = random_bool_generator.nextBoolean();
			if (home_address_requested) {
				Predicate home_address = new Predicate("request");
				home_address.addTerm(new Predicate("home_address"));
				home_address.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", home_address));
				home_address_sent = true;
			}
		}


		if (!marital_status_sent) {
			boolean marital_status_requested = random_bool_generator.nextBoolean();
			if (marital_status_requested) {
				Predicate marital_status = new Predicate("request");
				marital_status.addTerm(new Predicate("marital_status"));
				marital_status.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", marital_status));
				marital_status_sent = true;
			}
		}

		if (!occupation_sent) {
			boolean occupation_requested = random_bool_generator.nextBoolean();
			if (occupation_requested) {
				Predicate occupation = new Predicate("request");
				occupation.addTerm(new Predicate("occupation"));
				occupation.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", occupation));
				occupation_sent = true;
			}
		}

		if (!education_sent) {
			boolean education_requested = random_bool_generator.nextBoolean();
			if (education_requested) {
				Predicate education = new Predicate("request");
				education.addTerm(new Predicate("education"));
				education.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", education));
				education_sent = true;
			}
		}

		if (!gps_sent) {
			boolean gps_requested = random_bool_generator.nextBoolean();
			if (gps_requested) {
				Predicate gps = new Predicate("request");
				gps.addTerm(new Predicate("gps"));
				gps.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", gps));
				gps_sent = true;
			}
		}


		if (!social_media_sent) {
			boolean social_media_requested = random_bool_generator.nextBoolean();
			if (social_media_requested) {
				Predicate social_media = new Predicate("request");
				social_media.addTerm(new Predicate("social_media"));
				social_media.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", social_media));
				social_media_sent = true;
			}
		}


		return messages;

	}

}
