package gwendolen.privacy.figure_2;

import java.util.HashSet;
import java.util.Set;

import ail.syntax.Message;
import ail.syntax.Predicate;
import gwendolen.mas.VerificationofAutonomousSystemsEnvironment;

public class AgentEnvSim extends VerificationofAutonomousSystemsEnvironment {

	boolean all_messages_shared = false;

	@Override
	public Set<Predicate> generate_percepts() {
		// TODO Auto-generated method stub
		return new HashSet<Predicate>();
	}

	@Override
	public Set<Message> generate_messages() {
		// TODO Auto-generated method stub
		Set<Message> messages = new HashSet<Message>();



		if (!all_messages_shared) {

			for(int i = 1; i <= 100; i++) {
				String dataName = "data" + i;
				Predicate data = new Predicate("request");
				data.addTerm(new Predicate(dataName));
				data.addTerm(new Predicate("vibe"));
				messages.add(new Message(1, "user", "agent", data));
			}

			all_messages_shared = true;

		}

		return messages;

	}

}
