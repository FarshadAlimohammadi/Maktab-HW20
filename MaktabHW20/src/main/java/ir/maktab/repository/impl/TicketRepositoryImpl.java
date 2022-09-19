package ir.maktab.repository.impl;

import ir.maktab.base.impl.BaseRepositoryImpl;
import ir.maktab.domain.Ticket;
import ir.maktab.domain.User;
import ir.maktab.repository.TicketRepository;
import ir.maktab.repository.UserRepository;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket> implements TicketRepository {

    @Override
    public Class<Ticket> getEntityClass() {
        return null;
    }
}
