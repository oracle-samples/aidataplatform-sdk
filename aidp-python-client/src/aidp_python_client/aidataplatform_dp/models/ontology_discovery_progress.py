# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyDiscoveryProgress(object):
    """
    Progress reported by an ontology discovery job.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyDiscoveryProgress object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param completed:
            The value to assign to the completed property of this OntologyDiscoveryProgress.
        :type completed: int

        :param total:
            The value to assign to the total property of this OntologyDiscoveryProgress.
        :type total: int

        :param current_stage:
            The value to assign to the current_stage property of this OntologyDiscoveryProgress.
        :type current_stage: str

        """
        self.swagger_types = {
            'completed': 'int',
            'total': 'int',
            'current_stage': 'str'
        }
        self.attribute_map = {
            'completed': 'completed',
            'total': 'total',
            'current_stage': 'currentStage'
        }
        self._completed = None
        self._total = None
        self._current_stage = None

    @property
    def completed(self):
        """
        Gets the completed of this OntologyDiscoveryProgress.
        Completed work item count.


        :return: The completed of this OntologyDiscoveryProgress.
        :rtype: int
        """
        return self._completed

    @completed.setter
    def completed(self, completed):
        """
        Sets the completed of this OntologyDiscoveryProgress.
        Completed work item count.


        :param completed: The completed of this OntologyDiscoveryProgress.
        :type: int
        """
        self._completed = completed

    @property
    def total(self):
        """
        Gets the total of this OntologyDiscoveryProgress.
        Total work item count.


        :return: The total of this OntologyDiscoveryProgress.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total):
        """
        Sets the total of this OntologyDiscoveryProgress.
        Total work item count.


        :param total: The total of this OntologyDiscoveryProgress.
        :type: int
        """
        self._total = total

    @property
    def current_stage(self):
        """
        Gets the current_stage of this OntologyDiscoveryProgress.
        Current discovery stage.


        :return: The current_stage of this OntologyDiscoveryProgress.
        :rtype: str
        """
        return self._current_stage

    @current_stage.setter
    def current_stage(self, current_stage):
        """
        Sets the current_stage of this OntologyDiscoveryProgress.
        Current discovery stage.


        :param current_stage: The current_stage of this OntologyDiscoveryProgress.
        :type: str
        """
        self._current_stage = current_stage

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
