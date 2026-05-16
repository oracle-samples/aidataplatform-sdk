# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateExperimentTagsDetails(object):
    """
    Details of the Experiment tags to update.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateExperimentTagsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment_id:
            The value to assign to the experiment_id property of this UpdateExperimentTagsDetails.
        :type experiment_id: str

        :param set_tags:
            The value to assign to the set_tags property of this UpdateExperimentTagsDetails.
        :type set_tags: list[oci.aidataplatform_dp.models.ExperimentTag]

        :param delete_tags:
            The value to assign to the delete_tags property of this UpdateExperimentTagsDetails.
        :type delete_tags: list[oci.aidataplatform_dp.models.ExperimentTagKey]

        """
        self.swagger_types = {
            'experiment_id': 'str',
            'set_tags': 'list[ExperimentTag]',
            'delete_tags': 'list[ExperimentTagKey]'
        }

        self.attribute_map = {
            'experiment_id': 'experiment_id',
            'set_tags': 'set_tags',
            'delete_tags': 'delete_tags'
        }

        self._experiment_id = None
        self._set_tags = None
        self._delete_tags = None

    @property
    def experiment_id(self):
        """
        **[Required]** Gets the experiment_id of this UpdateExperimentTagsDetails.
        Unique identifier for the experiment.


        :return: The experiment_id of this UpdateExperimentTagsDetails.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this UpdateExperimentTagsDetails.
        Unique identifier for the experiment.


        :param experiment_id: The experiment_id of this UpdateExperimentTagsDetails.
        :type: str
        """
        self._experiment_id = experiment_id

    @property
    def set_tags(self):
        """
        Gets the set_tags of this UpdateExperimentTagsDetails.
        Experiment tags to set


        :return: The set_tags of this UpdateExperimentTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentTag]
        """
        return self._set_tags

    @set_tags.setter
    def set_tags(self, set_tags):
        """
        Sets the set_tags of this UpdateExperimentTagsDetails.
        Experiment tags to set


        :param set_tags: The set_tags of this UpdateExperimentTagsDetails.
        :type: list[oci.aidataplatform_dp.models.ExperimentTag]
        """
        self._set_tags = set_tags

    @property
    def delete_tags(self):
        """
        Gets the delete_tags of this UpdateExperimentTagsDetails.
        Experiment tags to delete


        :return: The delete_tags of this UpdateExperimentTagsDetails.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentTagKey]
        """
        return self._delete_tags

    @delete_tags.setter
    def delete_tags(self, delete_tags):
        """
        Sets the delete_tags of this UpdateExperimentTagsDetails.
        Experiment tags to delete


        :param delete_tags: The delete_tags of this UpdateExperimentTagsDetails.
        :type: list[oci.aidataplatform_dp.models.ExperimentTagKey]
        """
        self._delete_tags = delete_tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
