package ir.maktab.service.impl;

import ir.maktab.base.impl.BaseServiceImpl;
import ir.maktab.domain.Ticket;
import ir.maktab.repository.TicketRepository;
import ir.maktab.service.TicketService;

public class TicketServiceImpl extends BaseServiceImpl<Ticket, TicketRepository> implements TicketService {
    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }
}
