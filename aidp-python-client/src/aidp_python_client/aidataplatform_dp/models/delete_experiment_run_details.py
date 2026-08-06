# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeleteExperimentRunDetails(object):
    """
    Details of the experiment run to delete.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeleteExperimentRunDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this DeleteExperimentRunDetails.
        :type run_id: str

        :param is_permanent:
            The value to assign to the is_permanent property of this DeleteExperimentRunDetails.
        :type is_permanent: bool

        """
        self.swagger_types = {
            'run_id': 'str',
            'is_permanent': 'bool'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'is_permanent': 'is_permanent'
        }

        self._run_id = None
        self._is_permanent = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this DeleteExperimentRunDetails.
        Unique identifier for the run.


        :return: The run_id of this DeleteExperimentRunDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this DeleteExperimentRunDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this DeleteExperimentRunDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def is_permanent(self):
        """
        Gets the is_permanent of this DeleteExperimentRunDetails.
        If true, the run is permanently deleted from the database instead of being soft deleted. Defaults to false.


        :return: The is_permanent of this DeleteExperimentRunDetails.
        :rtype: bool
        """
        return self._is_permanent

    @is_permanent.setter
    def is_permanent(self, is_permanent):
        """
        Sets the is_permanent of this DeleteExperimentRunDetails.
        If true, the run is permanently deleted from the database instead of being soft deleted. Defaults to false.


        :param is_permanent: The is_permanent of this DeleteExperimentRunDetails.
        :type: bool
        """
        self._is_permanent = is_permanent

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
