package com.tcs.services;

import com.tcs.model.PlanData;
import com.tcs.repository.PlanDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 716644 on 5/13/2015.
 */
@Service
@Transactional
public class PlanDataService {
    @Autowired
    private PlanDataRepository pdRepository;

    public List<PlanData> findAll()
    {
        return pdRepository.findAll();
    }

    public PlanData create(PlanData plan)
    {
        return pdRepository.save(plan);
    }

    public PlanData findPlanByBDWMAPPINGID(int BDWMAPPINGID)
    {
        return pdRepository.findOne(BDWMAPPINGID);
    }

    public PlanData update(PlanData plan)
    {
        return pdRepository.save(plan);
    }

    /*public PlanData deletePlan(PlanData planData)
    {
        return pdRepository.save(planData);
    } TODO*/

    public List<PlanData> findPlanByCyYearAndActive(int cyYear, int active)
    {
        return pdRepository.findPlanByCyYearAndActive(cyYear, active);
    }

    public PlanData findPlanByCyYearAndActiveAndCyPbpIdAndCySegmentAndCyContractNum(int cyYear, int active, String cyPbpId, String cySegment, String cyContractNum)
    {
        return pdRepository.findPlanByCyYearAndActiveAndCyPbpIdAndCySegmentAndCyContractNum(cyYear, active, cyPbpId, cySegment, cyContractNum);
    }


}
