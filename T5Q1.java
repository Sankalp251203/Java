interface VoiceAssistant {
    void respond();
}

interface ChatAssistant {
    void respond();
}

class T5Q1 implements VoiceAssistant, ChatAssistant {
    // Overriding the conflicting method
    @Override
    public void respond() {
        System.out.println("SmartAssistant responding in both voice and chat mode.");
    }

    public static void main(String[] args) {
        T5Q1 assistant = new T5Q1();
        assistant.respond();
    }
}
