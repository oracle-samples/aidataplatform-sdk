# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LineageGraphNodeNeighborsFilter(object):
    """
    Optional filter criteria for fetching lineage graph node neighbors.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LineageGraphNodeNeighborsFilter object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param process_run_stage_id:
            The value to assign to the process_run_stage_id property of this LineageGraphNodeNeighborsFilter.
        :type process_run_stage_id: str

        """
        self.swagger_types = {
            'process_run_stage_id': 'str'
        }

        self.attribute_map = {
            'process_run_stage_id': 'processRunStageId'
        }

        self._process_run_stage_id = None

    @property
    def process_run_stage_id(self):
        """
        Gets the process_run_stage_id of this LineageGraphNodeNeighborsFilter.
        Filters only the neighbors for a particular stage in a multi-stage process.


        :return: The process_run_stage_id of this LineageGraphNodeNeighborsFilter.
        :rtype: str
        """
        return self._process_run_stage_id

    @process_run_stage_id.setter
    def process_run_stage_id(self, process_run_stage_id):
        """
        Sets the process_run_stage_id of this LineageGraphNodeNeighborsFilter.
        Filters only the neighbors for a particular stage in a multi-stage process.


        :param process_run_stage_id: The process_run_stage_id of this LineageGraphNodeNeighborsFilter.
        :type: str
        """
        self._process_run_stage_id = process_run_stage_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
