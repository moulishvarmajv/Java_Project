package com.moulish.repository;

import java.util.ArrayList;
import java.util.List;

import com.moulish.model.ClassSession;

public class SessionRepository {

    private final List<ClassSession> sessions;

    public SessionRepository() {
        sessions = new ArrayList<>();
    }

    //To add a Session

    public void addSession(ClassSession session) {
        sessions.add(session);
    }

    //To remove a Session

    public boolean removeSession(String sessionId) {

        ClassSession session = findSessionById(sessionId);

        if (session == null) {
            return false;
        }

        sessions.remove(session);
        return true;
    }

    //To Find a Session

    public ClassSession findSessionById(String sessionId) {

        for (ClassSession session : sessions) {

            if (session.getSessionId()
                    .equalsIgnoreCase(sessionId)) {

                return session;
            }

        }

        return null;
    }

    //To get aal the Session

    public List<ClassSession> getAllSessions() {
        return sessions;
    }

    //To find whether the Session Exsist or Not

    public boolean sessionExists(String sessionId) {

        return findSessionById(sessionId) != null;

    }

}