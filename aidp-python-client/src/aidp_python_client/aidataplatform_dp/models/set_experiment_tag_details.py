# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SetExperimentTagDetails(object):
    """
    Tag details to set on an experiment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SetExperimentTagDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment_id:
            The value to assign to the experiment_id property of this SetExperimentTagDetails.
        :type experiment_id: str

        :param key:
            The value to assign to the key property of this SetExperimentTagDetails.
        :type key: str

        :param value:
            The value to assign to the value property of this SetExperimentTagDetails.
        :type value: str

        """
        self.swagger_types = {
            'experiment_id': 'str',
            'key': 'str',
            'value': 'str'
        }

        self.attribute_map = {
            'experiment_id': 'experiment_id',
            'key': 'key',
            'value': 'value'
        }

        self._experiment_id = None
        self._key = None
        self._value = None

    @property
    def experiment_id(self):
        """
        **[Required]** Gets the experiment_id of this SetExperimentTagDetails.
        Unique identifier for the experiment.


        :return: The experiment_id of this SetExperimentTagDetails.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this SetExperimentTagDetails.
        Unique identifier for the experiment.


        :param experiment_id: The experiment_id of this SetExperimentTagDetails.
        :type: str
        """
        self._experiment_id = experiment_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this SetExperimentTagDetails.
        Key of the experiment tag.


        :return: The key of this SetExperimentTagDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this SetExperimentTagDetails.
        Key of the experiment tag.


        :param key: The key of this SetExperimentTagDetails.
        :type: str
        """
        self._key = key

    @property
    def value(self):
        """
        **[Required]** Gets the value of this SetExperimentTagDetails.
        Value of the experiment tag.


        :return: The value of this SetExperimentTagDetails.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this SetExperimentTagDetails.
        Value of the experiment tag.


        :param value: The value of this SetExperimentTagDetails.
        :type: str
        """
        self._value = value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
