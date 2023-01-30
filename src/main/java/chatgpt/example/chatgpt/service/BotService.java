package chatgpt.example.chatgpt.service;

import chatgpt.example.chatgpt.entities.BotRequest;
import chatgpt.example.chatgpt.entities.ChatGptResponse;

public interface BotService {
    ChatGptResponse askQuestion(BotRequest botRequest);
}
