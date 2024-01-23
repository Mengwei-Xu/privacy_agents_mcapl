package gwendolen.privacy.figure_3;

import java.util.HashSet;
import java.util.Set;

import ail.syntax.Message;
import ail.syntax.Predicate;
import gwendolen.mas.VerificationofAutonomousSystemsEnvironment;

public class AgentVerificationEnvSeq extends VerificationofAutonomousSystemsEnvironment {


	//data(data1)
	//data(data2) *
	//data(data3)
	//data(data4) *
	//data(data5)
	//data(data6)
	//data(data7) *
	//data(data8) *
	//data(data9) *
	//data(data10) *


	static boolean[] data_sent = new boolean[10];
	static {
		data_sent[0] = true;
		data_sent[1] = true;
		data_sent[2] = true;
		data_sent[3] = false;
		data_sent[4] = true;
		data_sent[5] = false;
		data_sent[6] = false;
		data_sent[7] = false;
		data_sent[8] = false;
		data_sent[9] = true;
	}



	@Override
	public Set<Predicate> generate_percepts() {
		// TODO Auto-generated method stub
		return new HashSet<Predicate>();
	}

	@Override
	public Set<Message> generate_messages() {
		// TODO Auto-generated method stub
		Set<Message> messages = new HashSet<Message>();

		for (int i = 0; i < data_sent.length; i++) {
			if (!data_sent[i]) {
				boolean data_present = random_bool_generator.nextBoolean();
				if (data_present) {
					Predicate data_predicate = new Predicate("request");
					data_predicate.addTerm(new Predicate("data" + (i + 1)));
					data_predicate.addTerm(new Predicate("vibe"));
					messages.add(new Message(1, "user", "agent", data_predicate));
					data_sent[i] = true;
				}
			}
		}
		return messages;

	}

}
