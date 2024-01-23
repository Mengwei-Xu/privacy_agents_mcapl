package gwendolen.privacy.figure_3;

import java.util.HashSet;
import java.util.Set;

import ail.syntax.Message;
import ail.syntax.Predicate;
import gwendolen.mas.VerificationofAutonomousSystemsEnvironment;

public class AgentVerificationEnvSim extends VerificationofAutonomousSystemsEnvironment {

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

			boolean[] data_sent = new boolean[10];

			for (int i = 0; i < data_sent.length; i++) {
				data_sent[i] = random_bool_generator.nextBoolean();
				if (data_sent[i]) {
					Predicate data_predicate = new Predicate("request");
					data_predicate.addTerm(new Predicate("data" + (i + 1)));
					data_predicate.addTerm(new Predicate("vibe"));
					messages.add(new Message(1, "user", "agent", data_predicate));
					}
			}

			all_messages_shared = true;

		}

		return messages;

	}

}
