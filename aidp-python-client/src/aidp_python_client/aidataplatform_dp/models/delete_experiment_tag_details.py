# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeleteExperimentTagDetails(object):
    """
    Tag details to delete on an Experiment.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeleteExperimentTagDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment_id:
            The value to assign to the experiment_id property of this DeleteExperimentTagDetails.
        :type experiment_id: str

        :param key:
            The value to assign to the key property of this DeleteExperimentTagDetails.
        :type key: str

        """
        self.swagger_types = {
            'experiment_id': 'str',
            'key': 'str'
        }

        self.attribute_map = {
            'experiment_id': 'experiment_id',
            'key': 'key'
        }

        self._experiment_id = None
        self._key = None

    @property
    def experiment_id(self):
        """
        **[Required]** Gets the experiment_id of this DeleteExperimentTagDetails.
        Unique identifier for the experiment.


        :return: The experiment_id of this DeleteExperimentTagDetails.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this DeleteExperimentTagDetails.
        Unique identifier for the experiment.


        :param experiment_id: The experiment_id of this DeleteExperimentTagDetails.
        :type: str
        """
        self._experiment_id = experiment_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this DeleteExperimentTagDetails.
        Key of the experiment tag.


        :return: The key of this DeleteExperimentTagDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this DeleteExperimentTagDetails.
        Key of the experiment tag.


        :param key: The key of this DeleteExperimentTagDetails.
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
