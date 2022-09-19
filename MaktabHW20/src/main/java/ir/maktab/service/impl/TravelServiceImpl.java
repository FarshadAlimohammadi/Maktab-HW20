package ir.maktab.service.impl;

import ir.maktab.base.impl.BaseServiceImpl;
import ir.maktab.domain.Travel;
import ir.maktab.repository.TravelRepository;
import ir.maktab.service.TravelService;

public class TravelServiceImpl extends BaseServiceImpl<Travel, TravelRepository> implements TravelService {

    public TravelServiceImpl(TravelRepository repository) {
        super(repository);
    }
}
