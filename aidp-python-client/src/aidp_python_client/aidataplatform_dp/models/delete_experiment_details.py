# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeleteExperimentDetails(object):
    """
    Details of the experiment to delete.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeleteExperimentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment_id:
            The value to assign to the experiment_id property of this DeleteExperimentDetails.
        :type experiment_id: str

        :param is_permanent:
            The value to assign to the is_permanent property of this DeleteExperimentDetails.
        :type is_permanent: bool

        """
        self.swagger_types = {
            'experiment_id': 'str',
            'is_permanent': 'bool'
        }

        self.attribute_map = {
            'experiment_id': 'experiment_id',
            'is_permanent': 'is_permanent'
        }

        self._experiment_id = None
        self._is_permanent = None

    @property
    def experiment_id(self):
        """
        **[Required]** Gets the experiment_id of this DeleteExperimentDetails.
        Unique identifier for the experiment.


        :return: The experiment_id of this DeleteExperimentDetails.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this DeleteExperimentDetails.
        Unique identifier for the experiment.


        :param experiment_id: The experiment_id of this DeleteExperimentDetails.
        :type: str
        """
        self._experiment_id = experiment_id

    @property
    def is_permanent(self):
        """
        Gets the is_permanent of this DeleteExperimentDetails.
        If true, the experiment is permanently deleted from the database instead of being soft deleted. Permanent deletion is rejected if the experiment has any associated run. Defaults to false.


        :return: The is_permanent of this DeleteExperimentDetails.
        :rtype: bool
        """
        return self._is_permanent

    @is_permanent.setter
    def is_permanent(self, is_permanent):
        """
        Sets the is_permanent of this DeleteExperimentDetails.
        If true, the experiment is permanently deleted from the database instead of being soft deleted. Permanent deletion is rejected if the experiment has any associated run. Defaults to false.


        :param is_permanent: The is_permanent of this DeleteExperimentDetails.
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
