# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeleteExperimentRunTagDetails(object):
    """
    Tag details to delete on an Experiment Run.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeleteExperimentRunTagDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this DeleteExperimentRunTagDetails.
        :type run_id: str

        :param key:
            The value to assign to the key property of this DeleteExperimentRunTagDetails.
        :type key: str

        """
        self.swagger_types = {
            'run_id': 'str',
            'key': 'str'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'key': 'key'
        }

        self._run_id = None
        self._key = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this DeleteExperimentRunTagDetails.
        Unique identifier for the run.


        :return: The run_id of this DeleteExperimentRunTagDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this DeleteExperimentRunTagDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this DeleteExperimentRunTagDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this DeleteExperimentRunTagDetails.
        Key of the run tag


        :return: The key of this DeleteExperimentRunTagDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this DeleteExperimentRunTagDetails.
        Key of the run tag


        :param key: The key of this DeleteExperimentRunTagDetails.
        :type: str
        """
        self._key = key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
