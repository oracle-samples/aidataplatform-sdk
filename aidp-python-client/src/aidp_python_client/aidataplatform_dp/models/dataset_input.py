# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DatasetInput(object):
    """
    DatasetInput
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DatasetInput object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param dataset:
            The value to assign to the dataset property of this DatasetInput.
        :type dataset: oci.aidataplatform_dp.models.Dataset

        :param tags:
            The value to assign to the tags property of this DatasetInput.
        :type tags: list[oci.aidataplatform_dp.models.InputTag]

        """
        self.swagger_types = {
            'dataset': 'Dataset',
            'tags': 'list[InputTag]'
        }

        self.attribute_map = {
            'dataset': 'dataset',
            'tags': 'tags'
        }

        self._dataset = None
        self._tags = None

    @property
    def dataset(self):
        """
        **[Required]** Gets the dataset of this DatasetInput.

        :return: The dataset of this DatasetInput.
        :rtype: oci.aidataplatform_dp.models.Dataset
        """
        return self._dataset

    @dataset.setter
    def dataset(self, dataset):
        """
        Sets the dataset of this DatasetInput.

        :param dataset: The dataset of this DatasetInput.
        :type: oci.aidataplatform_dp.models.Dataset
        """
        self._dataset = dataset

    @property
    def tags(self):
        """
        Gets the tags of this DatasetInput.
        Tags for the dataset input.


        :return: The tags of this DatasetInput.
        :rtype: list[oci.aidataplatform_dp.models.InputTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this DatasetInput.
        Tags for the dataset input.


        :param tags: The tags of this DatasetInput.
        :type: list[oci.aidataplatform_dp.models.InputTag]
        """
        self._tags = tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
