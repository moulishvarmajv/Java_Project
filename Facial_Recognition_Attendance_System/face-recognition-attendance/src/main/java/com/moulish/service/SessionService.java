package com.moulish.service;

import com.moulish.model.ClassSession;
import com.moulish.repository.SessionRepository;

public class SessionService {

    private final SessionRepository sessionRepository;

    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    //Create a Session
    public void createSession(ClassSession session) {

        if (sessionRepository.sessionExists(session.getSessionId())) {
            throw new IllegalArgumentException("Session ID already exists.");
        }

        sessionRepository.addSession(session);
    }

    //Search for a Session
    public ClassSession searchSession(String sessionId) {

        ClassSession session = sessionRepository.findSessionById(sessionId);

        if (session == null) {
            throw new IllegalArgumentException("Session not found.");
        }

        return session;
    }

    //Delete a Session
    public void deleteSession(String sessionId) {

        if (!sessionRepository.removeSession(sessionId)) {
            throw new IllegalArgumentException("Session not found.");
        }

    }

    //Update Classroom
    public void updateClassroom(String sessionId, String classroom) {

        ClassSession session = searchSession(sessionId);
        session.setClassroom(classroom);

    }

    //Dsplay all Sessions
    public void displayAllSessions() {

        if (sessionRepository.getAllSessions().isEmpty()) {
            System.out.println("No Sessions Available.");
            return;
        }

        for (ClassSession session : sessionRepository.getAllSessions()) {
            System.out.println(session);
        }

    }

    //Check whether Session Exists
    public boolean sessionExists(String sessionId) {
        return sessionRepository.sessionExists(sessionId);
    }

}