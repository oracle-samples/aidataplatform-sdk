# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RestoreExperimentRunDetails(object):
    """
    Details of the experiment run to restore.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RestoreExperimentRunDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this RestoreExperimentRunDetails.
        :type run_id: str

        """
        self.swagger_types = {
            'run_id': 'str'
        }

        self.attribute_map = {
            'run_id': 'run_id'
        }

        self._run_id = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this RestoreExperimentRunDetails.
        Unique identifier for the run.


        :return: The run_id of this RestoreExperimentRunDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this RestoreExperimentRunDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this RestoreExperimentRunDetails.
        :type: str
        """
        self._run_id = run_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
