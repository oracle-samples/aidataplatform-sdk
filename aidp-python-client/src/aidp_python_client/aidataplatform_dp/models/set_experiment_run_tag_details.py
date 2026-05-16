# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SetExperimentRunTagDetails(object):
    """
    Tag details to set on an Experiment Run.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SetExperimentRunTagDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this SetExperimentRunTagDetails.
        :type run_id: str

        :param key:
            The value to assign to the key property of this SetExperimentRunTagDetails.
        :type key: str

        :param value:
            The value to assign to the value property of this SetExperimentRunTagDetails.
        :type value: str

        """
        self.swagger_types = {
            'run_id': 'str',
            'key': 'str',
            'value': 'str'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'key': 'key',
            'value': 'value'
        }

        self._run_id = None
        self._key = None
        self._value = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this SetExperimentRunTagDetails.
        Unique identifier for the run.


        :return: The run_id of this SetExperimentRunTagDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this SetExperimentRunTagDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this SetExperimentRunTagDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this SetExperimentRunTagDetails.
        Key of the run tag


        :return: The key of this SetExperimentRunTagDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this SetExperimentRunTagDetails.
        Key of the run tag


        :param key: The key of this SetExperimentRunTagDetails.
        :type: str
        """
        self._key = key

    @property
    def value(self):
        """
        **[Required]** Gets the value of this SetExperimentRunTagDetails.
        Value of the run tag


        :return: The value of this SetExperimentRunTagDetails.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this SetExperimentRunTagDetails.
        Value of the run tag


        :param value: The value of this SetExperimentRunTagDetails.
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
