package ir.maktab.repository.impl;

import ir.maktab.base.impl.BaseRepositoryImpl;
import ir.maktab.domain.Travel;
import ir.maktab.domain.User;
import ir.maktab.repository.TravelRepository;
import ir.maktab.repository.UserRepository;

public class TravelRepositoryImpl extends BaseRepositoryImpl<Travel> implements TravelRepository {
    @Override
    public Class<Travel> getEntityClass() {
        return null;
    }
}
